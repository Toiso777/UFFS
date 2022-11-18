from queue import Empty

#------------------------------------#------------------------------------#------------------------------------#------------------------------------
def menu():
    print("Bom dia! Esta é a calculadora oficial do Vasco da gama.")
    print("Por favor, selecione o tipo de probilidade a ser calculada")
    print("Tecle: ")
    print("1 para Probabilidade binomial individual")
    print("2 para Probalilidade Binomial acumulada")
    
#------------------------------------#------------------------------------#------------------------------------#------------------------------------
def viraDec(p):
    resultado = p / 100
    return resultado
#------------------------------------#------------------------------------#------------------------------------#------------------------------------
def fatora(valor):
    numFat = valor
    fat = 1
    i = 2
    while i <= numFat:
        fat = fat*i
        i = i + 1
    return fat
#------------------------------------#------------------------------------#------------------------------------#------------------------------------
def cnForm(nFa,xFa,nxFa):
    resultado = nFa/(nxFa * xFa)
    return resultado
#------------------------------------#------------------------------------#------------------------------------#------------------------------------
def biForm(cnx, p, q, x ,nx):
    resultado = cnx * (p**x) * (q**nx) 
    return resultado
#------------------------------------#------------------------------------#------------------------------------#------------------------------------
def acumulada(pDec, q, fatoraN, x, n):
   resultado = 0
   while x >=0: 
    fatoraX= fatora(x)
    fatoraXN = fatora(n-x)
    nx = n - x
    cnx = cnForm(fatoraN, fatoraX, fatoraXN)
    resultado += biForm(cnx,pDec,q,x,nx) *100  
    x-=1
   return(resultado); 
#------------------------------------#------------------------------------#------------------------------------#------------------------------------  
        


#------------------------------------#------------------------------------#------------------------------------#------------------------------------
menu()
coma = int(input("Digite o comando: "))

if coma == 1:
   n = int(input("Digite o valor de N: "))
   p = int(input("Digite o valor de P (em sua forma relativa): "))
   x = int(input("Digite o valor de X: "))
   pDec = viraDec(p)
   q = 1 - pDec
   nx = n - x
   fatoraN=fatora(n)
   fatoraX= fatora(x)
   fatoraXN = fatora(n-x)
   cnx = cnForm(fatoraN, fatoraX, fatoraXN) 
   resultado = biForm(cnx, pDec, q, x, nx) * 100
   print(f"O resultado é: {resultado:_.2f}%")
if coma == 2:
   n = int(input("Digite o valor de N: "))
   p = int(input("Digite o valor de P (em sua forma relativa: ) "))
   x = int(input("Digite o valor de X: "))
   pDec = viraDec(p)
   q = 1 - pDec
   fatoraN=fatora(n)
   resultado = acumulada(pDec, q, fatoraN,x,n)
   print(f"O resultado é: {resultado:.2f}%")   

#------------------------------------#------------------------------------#------------------------------------#------------------------------------
    
