#command + / block mark
# print(10 + 5)
# print(10 - 5)
# print(10 * 5)
# print(10 / 5)

# print(10 % 5) #comment 0
# print(10 % 3) #comment 1

# print(2 ** 3)#comment 8
# print(3 ** 2)#comment 9

#absolute value (絕對值)
# print(abs(-5))#5
# print(abs(5))#5

#pow (指數)
# print(pow(2,10))#1024

#max min (最大最小值)
# print(max(1,23,65,12,34))


#round 特殊小數點後四捨五入,如果最終結果不是偶數那就不會執行
# print(round(2.5))#2
# print(round(3.5))#4

#transation datatype str() int() float()
# print(str(3) + str(2) )#32
# print(int(2) + int(3) )#5

#Math moudle
#import math

    #constant(常數)
# print(math.e)
# print(math.pi)
    #
# print(math.floor(3.0000001))#無條件去除小數
# print(math.ceil(4.0000000001))#無條件進位
# print(math.sqrt(36))#開根號
# print(math.floor(math.sqrt(36)))#開完根號後去除小數點

#string
# print("hello"[1])
    #clicing
# x = "abcdefg"
# print(x[2:])#index[2]~all
# print(x[:])#index[] all
# print(x[2:5])#index[2]~index[5]
# print(x[::2])#aceg stepsize 

# print('I sad "Good moring."') #字串裡面加雙引號


# myString1 ="Hello"
# myString1[0]='h'
# print(myString1)


# print(len("aloha"))

# print( int("two") )

#替換原先字
# name = "Jonathan Joestar"
# print(name.replace("J","K"))


#split 以（區分項目）
# sentence = "Today is a good day."
# print(sentence.split( ))
# #需要將區分物件放置（）中，並以 字元顯示
# print(list(sentence))


# #use format to insert value
# print("{},{},{}".format(20,"This not is number",3.14))
# print("{0},{0},{0}".format(20,"This not is number",3.14))
# print("{1},{2},{1}".format(20,"This not is number",3.14))


# name = "Alex"
# age = 13 

# print(f"Hi my name is {name} ,I am {age} year old")


##use [number]區分第幾位
# friendList = ["Mike","Josh","Lisa"]
# print(f"My best friend is {friendList[1]}")


