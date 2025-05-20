# 4.1 – Plano de Testes

## Objetivo

Verificar se a API de tarefas funciona corretamente em todas as suas funcionalidades principais.

## Requisitos a serem testados

| ID | Requisito | Descrição |
|----|-----------|-----------|
| RF01 | Cadastro de Tarefa | Deve permitir o cadastro de tarefas. |
| RF02 | Listagem de Tarefas | Deve listar todas as tarefas cadastradas. |
| RF03 | Atualização de Tarefa | Deve permitir atualizar dados da tarefa. |
| RF04 | Exclusão de Tarefa | Deve excluir uma tarefa. |
| RF05 | Marcar como Concluída | Deve atualizar o status da tarefa. |

## Critérios de Aceitação

- Status HTTP corretos (200, 201, 400, 404 etc.)
- Dados persistidos corretamente
- Respostas claras em caso de erro
