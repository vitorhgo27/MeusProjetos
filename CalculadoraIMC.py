#idade : int
#peso : float
#altura : float

print("Calculadora de IMC!")
idade = int(input("Digite sua idade: "))
print(idade)
peso = float(input("Digite seu peso(Kg): "))
print(peso)
altura = float(input("Digite sua altura(mt): "))
print(altura)

imc = peso / (altura * altura)

print("O seu IMC é: ", imc)

if imc <= 18.5:
    print("Você está abaixo do peso.")
    print("O ideal para você é aumentar o seu peso.")
elif imc <= 24.9:
    print("Peso Normal.")
    print("O ideal é que você mantenha seu peso.")
elif imc <= 29.9:
    print("Excesso de peso.")
    print("O ideal é que você diminua seu peso.")
elif imc <= 34.9:
    print("Obesidade I, Você esta acima do peso")
    print("Você deve praticar atividades para diminuir seu peso")
elif imc <= 39.9:
    print("Obesidade II, Você está bem acima do peso")
    print("Para sua saude, você deve praticar mais atividades e tentar uma alimentação adequada")
elif imc >= 39.9:
    print("Obesidade III, você está muito acima do seu peso")
    print("Você precisa praticar mais atividades e melhorar sua alimentação, o ideal é procurar especialistas!")
else:
    print("Valores invalidos")
