
# Gestão de Tarefas

API REST para gerenciamento de tarefas, desenvolvida como parte do Trabalho A3 da disciplina **Gestão e Qualidade de Software** do Centro Universitário UNA.

## 📋 Funcionalidades

A API permite:

- ✅ Cadastrar tarefas
- 📄 Listar todas as tarefas
- ✏️ Atualizar informações de uma tarefa
- 🗑️ Excluir tarefas
- ✅ Marcar tarefas como concluídas

## 🛠 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Swagger (opcional para documentação)
- JUnit 5 e Mockito (testes)

## 🧪 Testes Automatizados

Os testes unitários estão localizados em:
```
src/test/java/com/leandro/gestaotarefas/
```

Para executar os testes:
```bash
./mvnw test
```

## 🚀 Como Executar o Projeto Localmente

1. Clone o repositório:
```bash
git clone https://github.com/Lp860/gestao-tarefas3.git
cd gestao-tarefas3
```

2. Configure o banco de dados PostgreSQL com as credenciais no arquivo `application.properties`.

3. Rode a aplicação:
```bash
./mvnw spring-boot:run
```

4. Acesse a API:
```
http://localhost:8080/api/tarefas
```

## 🧭 Endpoints principais

| Método | Rota                      | Descrição                 |
|--------|---------------------------|---------------------------|
| POST   | /api/tarefas              | Cadastrar nova tarefa     |
| GET    | /api/tarefas              | Listar todas as tarefas   |
| PUT    | /api/tarefas/{id}         | Atualizar tarefa          |
| DELETE | /api/tarefas/{id}         | Excluir tarefa            |
| PATCH  | /api/tarefas/{id}/concluir| Marcar como concluída     |

## 📚 Documentação

Os arquivos de documentação técnica estão disponíveis no repositório:

- `Introducao.md`
- `PlanoDeTestes.md`
- `RoteiroDeTestes.md`
- `CriteriosQualidade.md`

## 👨‍💻 Autor

Leandro Silveira da Silva  
[GitHub: Lp860](https://github.com/Lp860)
