# TP1 Proba - stats
## 11
# Pays
Pays <- c("Algerie","Australie","Bresil","Inde","Israel","Russie","Suisse","Suede")

# Taux de natalité 
Natalite <- c(36.4,21.6,45,20.9,25,21.2,18.9,14.8)

# Taux de mortalité
Mortalite <- c(14.6,8.7,13.5,12.1,11.7,7.2,9.6,8.8)

# Tableau
Tableau <- data.frame(Pays,Natalite,Mortalite)
print(Tableau)

# 1. Taux de Croissance, TN - TM / 1000
tcs = 18.9-9.6
print('taux de Croissance pop° Suisse pour 1000 personnes :')
print(tcs)

# 2. Taux de Croissance, TN - TM / 0005
tcb =(45-13.5)*5
print('taux de Croissance pop° Bresilienne pour 5000 personnes :')
print(tcb)

# 3.
# 4.
# Les vecteurs sont contenus dans le dataframe Tableau

# 5. Accroissement naturel

Croissance <- Natalite-Mortalite

# 6. Affichage

print(cbind(Pays,Croissance))

# 7. Taux de croissance du deuxieme pays

tc2 <- Croissance[2]
print("taux de croissance du deuxieme pays :")
print(tc2)

# 8. Taux de croissance du pays 3 et 5

tc3_5 <- c(Croissance[3],Croissance[5])
print("taux de croissance des pays 3 et 5 :")
print(tc3_5)

# 9. Taux de croissance de tous les pays sauf le premier

tc_sans1 <- c(Croissance[2 : 8])
print("Taux de croissance de tous les pays sauf le premier")
print(tc_sans1)

# 10. Taux de croissance de tous les pays > 25

tc_sup25 <- Croissance[Natalite>25]
print("Taux de croissance de tous les pays > 25")
print(tc_sup25)

# 11. Nb total de pays considérés

nb_total <- length(Croissance)
print("nombre total pays consideres")
print(nb_total)

# 12. Taux de croissance > 15

Croissance1 <- Croissance[Croissance>15]
print("Taux de croissance > 15")
print(Croissance1)

# 13.

print("Proportion des pays ayant un taux de croissance supérieur à 15 : ")
print(length(Croissance1)/length(Croissance))

# 14.
print("Somme des taux de croissance divisée par le nb de pays : ")
print(sum(Croissance/length(Croissance)))

# 15.

# plot(Natalite,Mortalite)

## 12

# 1.

Y=c(rep("petit",4),rep("grand",7),rep("moyen",3))
table(Y)
table(Y)/length(Y)
Y = as.factor(Y) # pour signaler qu'il s'agit d'une variable qualitative
table(Y)
table(Y)/length(Y)
summary(Y)

# 2. 

Y=c(rep("petit",4),rep("grand",7),rep("moyen",3))
freq=table(Y)
barplot(freq)