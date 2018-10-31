import xlwt
import requests
from bs4 import BeautifulSoup
newsurl="http://www.chinahighway.com/xw/xw_gnjt.php"
res=requests.get(newsurl)
res.encoding='gb2312'
soup=BeautifulSoup(res.text,'lxml')
print(type(soup))
print(soup.name)
myList=[]
for news1 in soup.select('.homelia'):
    myList.append(news1['title'])

print(myList)
workbook = xlwt.Workbook(encoding='utf-8')
sheet1 = workbook.add_sheet("测试表格")
sheet1.write(0,0,"序号")
print(len(myList))
for i in range(1,len(myList)):
    print(myList[i])
    sheet1.write(i,0,myList[i])
workbook.save(r'D:\lmylmy.xls')
