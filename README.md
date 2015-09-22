# treinamento-maps_solid_agile-oo-warmup
Projeto de warm up do treinamento de SOLID realizado por Akira A. na MAPS S.A..

Projeto Maven. Para executar: mvn -quiet

Program1 é um cliente de uma biblioteca representada por MessageFormatterAndLogger. Esta "biblioteca" tem um pequeno problema de design. De uma olhada no código e tente pensar no seguinte:

    1) Como eu altero o formato do log?
    2) Como eu altero o destino do log? No projeto, o log esta indo para STDERR.
    3) Como refatorar o código para que o cliente possa escolher um formato dentre uma lista de N formatos e um destino dentre uma lista de M destinos?
    4) Como você descreveria o problema de design em MessageFormatterAndLogger?
    
