import os 
FileName="test_p"
while(1):
    Number = input("輸入資料夾順序")
    if (Number=="exit"):
        break
    else:
        A=FileName+Number
        os.mkdir(A)

    
        




