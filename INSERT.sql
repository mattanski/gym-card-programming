INSERT INTO Abbonati (Nome,Cognome,NumeroTessera)
VALUES('Mario','Rossi','SPI0000001')

INSERT INTO Abbonati(Nome,Cognome,NumeroTessera)
VALUES('Federico','Verde','SPI0000002')


INSERT INTO Abbonati(Nome,Cognome,NumeroTessera)
VALUES('Lucio','Giallo','SPM0000003')


INSERT INTO Abbonati(Nome,Cognome,NumeroTessera)
VALUES('Francesco','Nero','SPM0000004')


INSERT INTO Abbonati(Nome,Cognome,NumeroTessera)
VALUES('Marco','Blu','SPI0000005')

INSERT INTO Abbonati(Nome,Cognome,NumeroTessera)
VALUES('Jhon','Fridman','CPI0000006')


INSERT INTO Abbonati(Nome,Cognome,NumeroTessera)
VALUES('Frank','Osvald','CPI0000007')

INSERT INTO Abbonati(Nome,Cognome,NumeroTessera)
VALUES('Marc','Sinchley','CPM0000008')

INSERT INTO Abbonati(Nome,Cognome,NumeroTessera)
VALUES('Jose','Rooney','CPM0000009')

INSERT INTO Abbonati(Nome,Cognome,NumeroTessera)
VALUES('Lucy','Callister','CPI000000010')



UPDATE Abbonati SET numerotessera = 'SPI0000001' WHERE ID = 1;
DELETE FROM  Abbonati WHERE id = 16;
