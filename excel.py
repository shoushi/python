# _*_ coding:utf-8 _*_
import xlrd
myFile=".\\industry.xlsx"
workbook=xlrd.open_workbook(myFile)
industry=workbook.sheet_by_index(0)
row_num=industry.nrows
col_num=industry.ncols
myList=[]

for i in  range(1, row_num):
    for j in range(1, col_num):
        if industry.cell(i,j).value == 1:
            temp=industry.cell(0,j).value.split('(')[1].split(')')[0]
            temp1=industry.cell(0,j).value[4:-1]
            
            myList.append(temp)

print(myList)

