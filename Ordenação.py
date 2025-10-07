nomes = []

print("Listagem de alunos")
qtd = int(input("Insira a quantidade de alunos: "))

for i in range(qtd):
    nome = input(f"\nInsira o nome do aluno {i+1}°: ")
    nomes.append(nome)

def bubble_sort(nomes):
    n = len(nomes)
    for i in range(n):
        troca_realizada = False
        for j in range(1, n - i - 1):
            if nomes[j] > nomes[j+1]:
                nomes[j], nomes[j+1] = nomes[j+1], nomes[j]
                troca_realizada = True
        if not troca_realizada:
            break
            
bubble_sort(nomes)

print("\n======================")
print("\nAlunos Inseridos")
for aluno in nomes:
    print(aluno)