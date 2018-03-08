# may-the-fourth-be-with-you-three



### DeadLock

<html>
<body>
<p style="text-align: justify"> Suponhamos que temos um método A e um método B, todos os dois métodos são sincronizados, ou seja, só um processo pode usar o método A ou B de cada vez, e então um processo A está executando o método A, e no momento da execução de A, o processo A necessita executar o método B, só que o método B já está sendo usado por outro processo B, e o processo B que está executando o método B também precisa executar o método A, como os dois métodos são sincronizados e só permitem a execução de um processo por vez, fica travado onde os processos ficam tentando utilizar um recurso que já está em uso por outro. </p>
<p style="text-align: justify">
Uma maneira de evitar esse caso é, ao sincronizar um método, ter cuidado para que ele não precise executar outro método sincronizado que faça referência a ele</p>



### ParallelStreams

A principal diferença é que uma Stream foi feita para ser usada de uma forma sequencial, onde a mesma não aproveita processadores multi-core, e o ParrallelStreams foi feito para aproveitar mais recursos de processadores multi-core. Bom mas onde eu usaria cada um.

Stream -> Suponha que eu tenha um sistema de hotelaria, e para se hospedar nesse hotel as pessoas deveriam preencher uma série de informações sobre quarto, diárias e tipos de hospedagem, e o quesito de processamento fosse sequencial, onde os clientes fossem sendo chamados sequencialmente de acordo com a disponibilidade de acomodações do hotel até que elas se terminassem, e assim os últimos da fila ficariam em lista de espera, seria uma ótimo lugar para se usar Stream pelo fato de ele ser sequencial. Esse exemplo não caberia bem o uso do ParallelStreams pois ele divide a Stream em várias sub-streams e não garante a sequência que se precisa nesse caso.

ParallelStreams -> Suponha que eu tenha um sistema onde eu pegaria vendas e faria um pré processamento das vendas e envia-se para outros sistemas que fossem fazer o resto do trabalho com as vendas. Esse tipo de trabalho não precisa garantir uma sequência, então dividir esse processamento em parelelo poderia trazer bons ganhos de performace.
</body>
</html>
