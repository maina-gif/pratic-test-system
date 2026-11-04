# Triângulos: de procedural a orientado a objetos (Java)

Mesmo problema resolvido em 3 versões para treinar refatoração:
ler as medidas de dois triângulos, calcular a área (fórmula de Heron)
e informar qual é a maior.

## Versões

| Versão | Estrutura | O que melhora |
|---|---|---|
| v1 | 6 variáveis soltas no `main` | Funciona, mas a fórmula é duplicada |
| v2 | Classe `Triangle` só com dados | Dados agrupados |
| v3 | `Triangle` com `area()` e `largerTriangle()` | Cálculo no lugar certo |

## Como executar

1. Requisitos: JDK 17+ (confirme a versão que você usa).
2. Compile e rode a classe `Program` da versão desejada.
3. Digite as 3 medidas de X e depois as 3 de Y.

## Casos de teste

(cole aqui a tabela com entrada, resultado esperado e resultado obtido)

## Problemas conhecidos

- Triângulo inválido (ex.: `1 1 5`) gera `NaN`.
- Lados negativos são aceitos sem erro.
- Em caso de empate, o resultado é Y.

## Próximos passos

- [ ] Validar entradas
- [ ] Encapsular atributos (`private` + construtor)
- [ ] Testes automatizados com JUnit
