'''dsaas'''
# _*_ coding:utf-8 _*_
import json

class person:
    name='tom'
    age=18

    '''类的初始化函数'''
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def getName(self):
        return self.name
    def getAge(self):
        return self.age

if __name__ == '__main__':

    json_str='{"name":"tom","age":"18"}'
    parsed_json=json.loads(json_str)
    print(parsed_json["name"])

    x=person('glq',22)
    print(x.getName()) 
    xgetName=x.getName()
    while True:
        print(xgetName)
