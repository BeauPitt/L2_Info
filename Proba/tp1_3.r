# Dé

# de=(ceiling(runif(1,0,6)))
# print(de)
# de2=(ceiling(runif(100000,0,6)))
# de3=(ceiling(runif(100000,0,6)))
# print(table(de2+de3))

# lois

## binom

x <- 0:5
y <- dbinom(x, size=5, prob=2/3)
# hist(y)

b <- pbinom(3, 5, 2/3)
print(b)

# loi de poisson

a <- dpois(12,2)
