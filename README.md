# Projeto-Algoritimos-T1

## Tarefa 1 – Parte 1: Análise de Desempenho de Algoritmos de Ordenação e Busca

### Objetivo
Desenvolver um programa que permita testar e comparar diferentes algoritmos de ordenação e busca para diferentes tamanhos de entrada, analisando a eficiência de cada um.

### Grupo
- **Breno Augusto Oliveira Gandolfo** - RA: 24.01496-6  
- **Gustavo Seripierri da Conceição** - RA: 24.00630-0  
- **Letícia de Carvalho Silva** - RA: 24.00141-4  
- **Lyssa Okawa Perini** - RA: 24.001193-2  

---

## Funcionalidades

### Algoritmos Implementados
- **Ordenação**:  
  - Bubble Sort  
  - Selection Sort  
  - Insertion Sort  
- **Busca**:  
  - Busca Linear  
  - Busca Binária  

### Entradas de Dados
- Vetores de tamanhos diferentes, gerados automaticamente com dimensões:  
  - 100 mil  
  - 200 mil  
  - 400 mil  
  - 800 mil  
  - 1,6 milhão  

### Medição de Desempenho
- **Repetição de Testes**:  
  - Para reduzir o impacto de flutuações no tempo de execução devido a processos em segundo plano, os testes serão repetidos várias vezes.  
- **Contadores de Operações-Chave**:  
  - Contagem de comparações e trocas para algoritmos de ordenação.  
  - Contagem de comparações para algoritmos de busca.  
- **Visualização de Resultados**:  
  - Gráficos e tabelas para facilitar a análise.  

---

## Desenvolvimento

### Implementação dos Algoritmos
- Métodos para os algoritmos de ordenação e busca serão implementados na classe `NossoVetor`.  
- Validação dos resultados para garantir a correção da saída.  

### Interface
- Criação de uma interface simples para interação, utilizando menus ou laços prontos.  

### Análise e Visualização
- Exibição dos resultados em tabelas e gráficos.  
- Comparação e interpretação dos resultados obtidos.  

---

## Ferramentas e Tecnologias

- **Linguagens e Ferramentas**:  
  - Java para implementação e execução dos algoritmos.  
  - Python para criação de gráficos.  
  - Microsoft Word para elaboração do relatório.  

---

## Passos

1. **Simulações e Generalização**  
   - Rodar experimentos com diferentes tamanhos de vetores para busca e ordenação.  

2. **Medir o Custo da Ordenação**  
   - Contar o número de comparações e trocas para cada algoritmo de ordenação (Bubble, Insertion e Selection).  

3. **Comparar Busca Linear vs. Busca Binária**  
   - Medir o número de acessos (comparações) para busca linear em vetores não ordenados.  
   - Medir o número de acessos (comparações) para busca binária em vetores ordenados.  

4. **Encontrar o Ponto de Equilíbrio**  
   - Comparar o custo de ordenação com a economia na busca.  
   - Determinar a partir de quantas buscas a ordenação passa a ser vantajosa.  

---

## Fatores a Considerar

- **Estabilidade Estatística**:  
  - Cada experimento será executado pelo menos 30 vezes para obter uma média estável, seguindo o princípio da Lei dos Grandes Números.  

---

## Resultados Esperados
- Comparação clara entre os algoritmos de ordenação e busca.  
- Identificação do ponto de equilíbrio entre o custo de ordenação e a economia na busca.  
- Gráficos e tabelas que auxiliem na interpretação dos resultados.  

---

**Trabalho desenvolvido para a disciplina de Algoritmos, Estruturas de Dados e Programação.**