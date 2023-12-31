$OK = $True
$Reboot = $False
$IP = "192.168.192.30"
$SubNet = "255.255.255.0"
$Gateway = "192.168.192.254"
$DNSServers = "168.95.1.1", "168.95.192.1"

cls

# 找到要設定的網路卡
$NIC = Get-WmiObject Win32_NetworkAdapterConfiguration |`
  Where {$_.IPEnabled -eq $True -and`
    $_.Description -eq "Intel 21140-Based PCI Fast Ethernet Adapter"}

# 檢查網路卡物件是否為 null
if ($NIC -eq $Null) {
  $OK = $False
  Write-Host "找不到要設定的網路卡！"
}
else
{
  # 開始設定
  $Status = $NIC.EnableStatic($IP, $SubNet)
  # 檢查設定的回傳值，0 表示設定成功，其他表示設定失敗
  if ($Status.ReturnValue -gt 0) {
    if ($Status.ReturnValue -eq 1) {
      $Reboot = $True
    }
    $OK = $False
    Write-Host "設定 IP 位址失敗！"}

  $Status = $NIC.SetGateWays($Gateway)
  # 檢查設定的回傳值，0 表示設定成功，其他表示設定失敗
  if ($Status.ReturnValue -gt 0) {
    if ($Status.ReturnValue -eq 1) {
      $Reboot = $True
    }
    $OK = $False
    Write-Host "設定預設閘道失敗！"}

  $Status = $NIC.SetDNSServerSearchOrder($DNSServers)
  # 檢查設定的回傳值，0 表示設定成功，其他表示設定失敗
  if ($Status.ReturnValue -gt 0) {
    if ($Status.ReturnValue -eq 1) {
      $Reboot = $True
    }
    $OK = $False
    Write-Host "設定 DNS 失敗！"}
}

# 檢查設定結果
if ($OK) {
  # 暫停 500 毫秒讓設定生效
  Start-Sleep -m 500

  Write-Host "設定成功！設定的結果如下："
  Write-Host "=============================="
  Write-Host "網路卡說明 : " $NIC.Description
  Write-Host "IP 位址 : " $NIC.IPAddress
  Write-Host "預設閘道 : " $NIC.DefaultIPGateway
  Write-Host "DNS 位址 : " $NIC.DNSServerSearchOrder
}

if ($Reboot) {
  Write-Host "您必須重新開機，才能讓設定生效！"
}