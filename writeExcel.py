import xlwt

workbook = xlwt.Workbook(encoding='utf-8')
sheet1 = workbook.add_sheet('测试表格')
sheet1.write(0,0,"序号")
sheet1.write(0,1,"科目")
l=['猪','羊','牛','驴','狗']
for i in range(0,len(l)):
    sheet1.write(i+1,0,i)
    sheet1.write(i+1,1,l[i])
#保存格式应该以03版为准，即.xls格式，否则会出现格式不正确问题
workbook.save(r'D:\test.xls')