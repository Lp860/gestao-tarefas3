# 4.2 – Roteiro de Testes

## Testes realizados na API

### Teste 1 – Cadastro de Tarefa
- Método: POST `/tarefas`
- Dados: `{ "titulo": "Estudar", "descricao": "Estudar para a prova de QA" }`
- Esperado: Status 201 Created, tarefa criada

### Teste 2 – Listagem de Tarefas
- Método: GET `/tarefas`
- Esperado: Lista de tarefas, incluindo a recém-criada

### Teste 3 – Atualização de Tarefa
- Método: PUT `/tarefas/1`
- Dados: `{ "titulo": "Estudar muito" }`
- Esperado: Status 200 OK, dados atualizados

### Teste 4 – Exclusão de Tarefa
- Método: DELETE `/tarefas/1`
- Esperado: Status 204 No Content

### Teste 5 – Marcar como Concluída
- Método: PATCH `/tarefas/1/concluir`
- Esperado: Status 200 OK, status "concluída" atualizado
