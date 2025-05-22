FIAP Frontend Challenge 2025

## Objetivo do Projeto

Este projeto simula, de forma interativa, o passo a passo de entrada em uma teleconsulta médica. Ele é voltado principalmente para pacientes com deficiências visuais, auditivas ou baixa afinidade digital, com o objetivo de:

- Familiarizar o paciente com o ambiente da teleconsulta;
- Promover acessibilidade durante a simulação;
- Oferecer suporte em tempo real em caso de dificuldades;
- Emitir um certificado de conclusão do testdrive;
- Notificar cuidadores, se houver cadastro.

---

## Estrutura do Projeto

```
src/
    main.java                                             # Arquivo principal para execução da simulação
    Main/
        Java/
             Domain/
                    Controller/
                               TestDriveSimulacao.java    #Orquestra toda a simulação com paciente e consulta

                       model/
                               Consulta.java               # Contém as informações da consulta agendada:
                               Paciente.java               #Contém os dados e o perfil do paciente:
                       enums/
                               SimulacaoEtapa.java         # Enum que define as etapas da simulação
                     service/
                               AcessibilidadeService.java  # Ajustes visuais e legendas conforme o paciente
                               AvatarMedico.java           # Avatar interativo que guia o paciente
                               CertificadoService.java     # Gera uma mensagem de conclusão da simulação com certificado
                               CuidadorService.java        # Permite cadastrar um cuidador e notificá-lo via "WhatsApp"
                               FeedbackService.java        # obter o feedback do paciente a cada etapa da simulação
                               SuporteService.java         # Notifica o suporte em caso de falha na etapa
```

---

## Modelos (model/)

### Paciente.java
Representa um paciente, contendo:
- nome, idade, telefone, email
- Flags de acessibilidade: deficienciaVisual e deficienciaAuditiva

### Consulta.java
Representa uma consulta médica:
- medico, especialidade, data (LocalDateTime)

### SimulacaoEtapa.java (enum)
Enumera as etapas da simulação:
- LOGIN_EMAIL, LOGIN_SENHA, ENTRADA_CHAMADA, ATIVAR_MICROFONE, ATIVAR_CAMERA
- Cada etapa contém:
  - Instruções
  - Ajuda adicional
  - Arquivo e descrição da imagem

---

## Serviços (service/)

### AvatarMedico.java
Simula um avatar que:
- Dá boas-vindas ao paciente
- Explica cada etapa com texto, imagem e áudio
- Pede feedback e oferece ajuda personalizada

### AcessibilidadeService.java
Habilita recursos de acessibilidade:
- Modo com fonte ampliada para idosos ou pessoas com deficiência visual
- Legendas de áudio para deficientes auditivos

### CertificadoService.java
Gera uma mensagem de conclusão da simulação com:
- Nome do paciente
- Horário e data
- Nome do médico

### CuidadorService.java
Permite cadastrar um cuidador e notificá-lo via "WhatsApp":
- Mensagem de conclusão do paciente
- Informações da consulta

### FeedbackService.java
Coleta feedback do paciente (S/N) após cada etapa:
- Indica sucesso ou falha
- Conta número de tentativas falhas
- Define se a simulação foi concluída

### SuporteService.java
Notifica o suporte em caso de falha na etapa:
- Mensagem com nome do paciente
- Etapa atual
- Data da consulta

---

## Execução da Simulação

A simulação é conduzida pelo TestDriveSimulacao.java, que:

1. Cadastra paciente e cuidador (opcional)
2. Inicia as etapas da simulação com o AvatarMedico
3. Chama os serviços de acessibilidade e suporte conforme o perfil do paciente
4. Emite certificado e notifica o cuidador ao final

---

## Foco

Este simulador é ideal para:
- Treinar pacientes idosos ou com baixa afinidade digital
- Reduzir faltas em teleconsultas
- Aumentar a confiança do paciente antes da consulta real

---

##  Tecnologias Utilizadas

- **Linguagem**: Java 17+
- **Paradigma**: Programação Orientada a Objetos (POO)

##  Integrantes

- **Lucas Nunes Soares** - RM: 566503  
- **Camily Vitoria Pereira Macial** - RM: 566520  
- **Gustavo Pinheiro de Oliveira** - RM: 566358

##  Como Executar

1. Certifique-se de ter o Java instalado (versão 17 ou superior).
2. Compile o projeto com um IDE (como IntelliJ ou Eclipse) ou via terminal.
3. Execute o arquivo `Main.java` localizado na pasta `src`.

---
Este projeto foi desenvolvido como uma simulação educacional para melhorar a inclusão digital no app de saude.
