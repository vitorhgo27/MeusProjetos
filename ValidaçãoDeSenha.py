import string
print("Verificação de Senha!")

def ValidarSenha():
    while True:
        senha = input("Crie sua senha: ")
        maiuscula = any(c.isupper() for c in senha)
        minuscula = any(c.islower() for c in senha)
        digitos = any(c.isdigit() for c in senha)
        caracteresEspeciais = string.punctuation
        simbolos = any(c in caracteresEspeciais for c in senha)
        
        if len(senha) < 9:
            print("\nSua senha deve conter mais caracteres!")
        elif not maiuscula:
            print("\nSua senha deve ter letras maiusculas!")
        elif not minuscula:
            print("\nSua senha deve conter letras minusculas!")
        elif not digitos:
            print("\nSua senha precisa de numeros!")
        elif not simbolos:
            print("\nSua senha precisa ter simbolos!")
        else:
            print("\nSenha valida.")
            break
            
ValidarSenha()