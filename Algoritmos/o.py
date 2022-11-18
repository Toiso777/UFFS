# Import math Library
import math

# Initialize the number of items to choose from
n = 7

# Initialize the number of possibilities to choose
k = 5

# Print total number of possible combinations
print (math.comb(n, k))

def probabiIndi():
    import math
    n=int(input(" Informe o número de observações ou provas (n) : "))
    k=int(input(" Informe o número de sucessos (x) : "))
    print(" Dica: A probabilidade de sucesso deve ser informada utilizando ponto flutuante, e deve ser menor que 1")
    print(" Exemplo: 80% deve ser informado como 0.80, 5% deve ser informado como 0.05")
    p=float(input(" Informe o número de probabilidade de sucesso em cada observação: "))
    q=float(1-p)
    combinacao=(math.comb(n, k))
    resultado=combinacao*((p)**k)*((q)**(n-k))
    print(" O resultado é : ", resultado)
    print(" Em porcentagem = ",resultado*100,"%")

def probabiAco():
  import math
  n=int(input(" Informe o número de observações ou provas (n) : "))
  x=int(input(" Informe o número de sucessos (x) : "))
  print(" Dica: A probabilidade de sucesso deve ser informada utilizando ponto flutuante, e deve ser menor que 1")
  print(" Exemplo: 80% deve ser informado como 0.80, 5% deve ser informado como 0.05")
  p=float(input(" Informe o número de probabilidade de sucesso em cada observação: "))
  q=float(1-p)
  soma=0
  for i in range(0, x+1):
    int(i)
    k=i
    combinacao=(math.comb(n, k))
    resultado=combinacao*((p)**k)*((q)**(n-k))
    soma=soma+resultado
    
  print(" O resultado é : ", soma)
  print(" Em porcentagem = ",soma*100,"%")


def telageral():
    
    print("-"*100)
    print(" "*40,"PAINEL GERAL"," "*40)
    print(" ")
    print("-"*100)
    print(" ")
    print("Para calcular Probabilidade Binomial Individual em que P = x ; Digite A ")
    print(" ")
    print("Para calcular Probabilidade Binomial Acumulada em que P <= x ; Digite B ")
    print(" ")
    print("Para Sair do Programa, digite: x")
    print(" ")
    return (input('\nDigite o código da operação que deseja fazer: '))    

modulopainel=0
while modulopainel != -1:
    selecaodousuario = telageral()
    if selecaodousuario == "A":
      probabiIndi()

    if selecaodousuario == "B":
      probabiAco()
    
    if selecaodousuario == "x":
      modulopainel=-1
    else:
      print(" ")
      print("-"*100)
      print(" ")
      print(" ")
      print(" ")
      print("-"*100)
      print(" ")