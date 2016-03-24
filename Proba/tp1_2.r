# 12

# 2.

Y=c(rep("petit",4),rep("grand",7),rep("moyen",3))
table(Y)
table(Y)/length(Y)
Y = as.factor(Y) # pour signaler qu'il s'agit d'une variable qualitative
table(Y)
table(Y)/length(Y)
summary(Y)

# 2.1

Y=c(rep("petit",4),rep("grand",7),rep("moyen",3))
freq=table(Y)
barplot(freq,col=c("#dedede"))

# 2.2

pie(table(Y),labels("appreci",col=c("#dddddd","#dedede","#ededed")))
freq <- c(4,5,9,7)
# pie(freq, names= appreci, ylab = "frequences", xlab = "appreciations", main = "la qualité")
pie(freq)

# 13. 

#x=rnorm(100);summary(x)
Poids <- c(62,70,71,71,69,73,73,69,73,69,68,70,79,70,70,60,70,73,62,69,64,77,70,67,73)
print(mean(Poids))
print(median(Poids))
print(quantile(Poids))
print(var(Poids))
print(sd(Poids))

# Diagrammes boites à moustaches

boxplot(Poids, ylab = "poids")

# Histogrammes

Jours <- c(12,14,19,18,15,15,18,17,20,27,22,23,21,21,33,28,14,18,16,13)
#hist(Jours)
par(mfrow=c(1,3)) ; hist(Jours) ; hist(Jours, prob=TRUE) ; hist(Jours,8)

hist(Poids)
