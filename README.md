# ReqRest compiler
## Introduction

ReqRest is a small programming language that compiles directly to Java. 
It provides syntax mainly for making HTTP requests but you can also use if statements, while loops, print statements, reading data from standard, arithmetic operations and boolean expressions.

Created as a final project for university course.

## Code sample
```
go

def test = 10#
print(test)#
newline#

load(test)#
print(test)#
newline#

if((5 add 25) gt (10 divide -12)) {
    print("5 + 25 is greater than 10 / -12")#
}
else if ((5 add 25) eq (10 divide -12)) {
    print("5 + 25 is equal to 10 / -12")#
}
else {
    print("5 + 25 is lower than 10 / -12")#
}
newline#

def testTrue = true#
if(testTrue && (5 gt -2)) {
    print("testTrue is true")#
}
newline#

def testFalse = false#
if(~testFalse) {
    print("testFalse is false")#
}
newline#

def getResponse = get("https://jsonplaceholder.typicode.com/posts/1")#
print("GET RESPONSE:")#
print(getResponse)#
newline#

def postResponse = post("https://jsonplaceholder.typicode.com/posts", "title=hello&body=world&userId=1")#
print("POST RESPONSE:")#
print(postResponse)#
newline#

def putResponse = put("https://jsonplaceholder.typicode.com/posts/1", "id=5&userId=10")#
print("PUT RESPONSE:")#
print(putResponse)#
newline#

def patchResponse = patch("https://jsonplaceholder.typicode.com/posts/1", "title=helloWorld")#
print("PATCH_RESPONSE:")#
print(patchResponse)#
newline#

def deleteResponse = delete("https://jsonplaceholder.typicode.com/posts/1")#
print("DELETE RESPONSE:")#
print(deleteResponse)#
newline#

def i = 0#
while(i lt 5) {
    print(i)#
    i = i add 1#
}

finish
```
