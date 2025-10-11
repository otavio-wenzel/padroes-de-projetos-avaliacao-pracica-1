Olá professor Escobar,
aqui segue minhas justificativas para as escolhas dos padroes e anexos para os diagramas.

Este link é do repositório em GDrive para os diagramas de cada questão em draw.io:
https://drive.google.com/drive/folders/121-jR9lENDWp-21jLMhZMb5NojWjZmlb

Questao 01: Modais
Para esta questao eu escolhi o padrao Factory Method porque ele permite criar diferentes tupos de transportes de forma generica e polimorfica, como os exemplos de modais da questão, sem utilizar condicionais (if/switch) no codigo princial. Este padrao permite criar cada fabrica responsavel por instanciar seu proprio modal, e o serviço apenas consome a interface comum para calcular as tarifas.
Dessa forma o sistema fica flexivel, facil de fazer manutenção e extender para novos modais quando precisar, pois segue o princípio solid: O/C.

Diagrama: https://drive.google.com/file/d/1n5R1FwBCICepTs9YnNzg5hrwDidDk5jp/view?usp=drivesdk


Questao 02: Pagamento
Para esta questao eu havia deduzido inicialmente que fosse ideal o padrao Observer, porem re-li a questao e acredito que esta tambem seja adequado o uso do padrão Factory Method porque a plataforma precisa instanciar dinamicamente diferentes processadores de pagamento sem o codigo principal conhecer os detalhes de criaçao.
Quando recebe uma fabrica, o service cria o produto polimorficamente e chama processarPagamento(valor) sem if/switch. Assim, o sistema fica desacoplado, facil de estender, colicando uma nova forma de pagamento quando precisar,  e alinhado ao Open/Closed.

Diagrama: https://drive.google.com/file/d/1V4IIVJpvDCTXSTSnfWS3r-wQKMA0h9Ye/view?usp=drivesdk


Questao 03: Noticias
Escolhi o Observer para esta questao porque o problema pede notificaçoes automaticas de um topico para multiplos leitores sempre que uma noticia é publicada. Com esse padrao, cada topico mantem sua lista de inscritos e chama notifyAll ao publicar. Os leitores apenas implementam update() e recebem a mensagem sem o site precisar controlar manualmente quem avisar
Assim garantimos baixo acoplamento, inscriçoes dinamicas e facilidade de extensao sem alterar o codigo existente.

Diagrama: https://drive.google.com/file/d/1Ig4Lm4xFtDIuox4DluQpvWekMbz8Sh0U/view?usp=drivesdk


Questao 04: Relatorio
Nesta questao lembrei do exemplo do café, que utiliza o padrao Decorator, e foi este que escolhi para aplicar nesta questao, escolhi porque o relatório basico deve receber funcionalidades opcionais de forma progressiva e combinavel, uma logica de camadas, sem alterar o codigo existente. Com uma interface comum e um componente concreto, cada recurso vira um decorador que envolve o relatorio e acrescenta comportamento. Assim, o cliente compoe livremente cada camada, mantendo baixo acoplamento, polimorfismo e o Open/Closed.

Diagrama: 


Consideracoes finais:
Apesar da dificuldade de fazer este trabalho, gostei muito estudar a escolha para cada uma das questoes, os exemplos de codigos e diagramas fornecidos tambem foram bastante uteis. Gostaria de ter feito melhor e implementado mais coisas em cada codigo, como na primeira e terceira questao, assim tambem trabalhado melhor em cada diagrama. Mas estou sem qualquer computador desde o início deste semestre, entao, por enquanto, estou tendo que fazer algumas partes pelos equipamentos da faculdade e outra parte pelo celular, até conseguir comprar um computador. Neste caso tive que fazer algo mais simples.
Pelo menos espero que a linha de entendimento esteja coreeta e aguardo seus comentários e observacoes para melhorar!

atenciosamente,
Otavio Wenzel
