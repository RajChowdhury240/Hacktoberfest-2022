import base64 
flag = open('sonal.txt', 'rb') #open binary file in read mode
cipherflag = flag.read()
for i in range(42):
    cipherflag = base64.b64decode(cipherflag)

print (cipherflag)
