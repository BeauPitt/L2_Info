# Réponses TP Web

>       http://math.univ-bpclermont.fr/~barrel/TP/#part4

## Question 1 :

commande : `curl -v -x sciproxy:60158 http://math.univ-bpclermont.fr/~barrel/TP/test.html --proxy-user locroce`

sortie :

                Enter proxy password for user 'locroce':
                * About to connect() to proxy sciproxy port 60158 (#0)
                *   Trying 172.17.160.21...
                * connected
                * Connected to sciproxy (172.17.160.21) port 60158 (#0)
                * Proxy auth using Basic with user 'locroce'
                > GET http://math.univ-bpclermont.fr/~barrel/TP/test.html HTTP/1.1
                > Proxy-Authorization: Basic bG9jcm9jZTpsNXI2Yw==
                > User-Agent: curl/7.26.0
                > Host: math.univ-bpclermont.fr
                > Accept: */*
                > Proxy-Connection: Keep-Alive
                >
                * additional stuff not fine transfer.c:1037: 0 0
                * HTTP 1.1 or later with persistent connection, pipelining supported
                < HTTP/1.1 200 OK
                < Date: Fri, 05 Feb 2016 16:13:18 GMT
                < Server: Apache/2.4.10 (FreeBSD) OpenSSL/1.0.1l-freebsd PHP/5.6.4
                < Content-Location: test.html.txt.fr
                < Vary: negotiate,accept,accept-language
                < TCN: choice
                < Last-Modified: Tue, 03 Feb 2015 10:07:32 GMT
                < ETag: "a-50e2c3d384100;52adcf364c418"
                < Accept-Ranges: bytes
                < Content-Length: 10
                < Content-Type: text/plain
                < Content-Language: fr
                < Age: 249819
                < Warning: 113 sciproxy (squid/3.4.8) This cache hit is still fresh and more than 1 day old
                < X-Cache: HIT from sciproxy
                < X-Cache-Lookup: HIT from sciproxy:60158
                < Via: 1.1 sciproxy (squid/3.4.8)
                < Connection: keep-alive
                <
                Bienvenue
                * Connection #0 to host sciproxy left intact
                * Closing connection #0

## Question 2 :

commande : `curl -v -X OPTIONS -x  sciproxy:60158 http://math.univ-bpclermont.fr/~barrel/TP/test.html --proxy-user locroce`

sortie :

                Enter proxy password for user 'locroce':
                * About to connect() to proxy sciproxy port 60158 (#0)
                *   Trying 172.17.160.21...
                * connected
                * Connected to sciproxy (172.17.160.21) port 60158 (#0)
                * Proxy auth using Basic with user 'locroce'
                > OPTIONS http://math.univ-bpclermont.fr/~barrel/TP/test.html HTTP/1.1
                > Proxy-Authorization: Basic bG9jcm9jZTpsNXI2Yw==
                > User-Agent: curl/7.26.0
                > Host: math.univ-bpclermont.fr
                > Accept: */*
                > Proxy-Connection: Keep-Alive
                >
                * additional stuff not fine transfer.c:1037: 0 0
                * HTTP 1.1 or later with persistent connection, pipelining supported
                < HTTP/1.1 200 OK
                < Date: Mon, 08 Feb 2016 13:51:58 GMT
                < Server: Apache/2.4.10 (FreeBSD) OpenSSL/1.0.1l-freebsd PHP/5.6.4
                < Vary: accept,accept-language
                < Allow: GET,HEAD,POST,OPTIONS,TRACE
                < Content-Length: 0
                < Content-Type: text/plain
                < Content-Language: fr
                < X-Cache: MISS from sciproxy
                < X-Cache-Lookup: MISS from sciproxy:60158
                < Via: 1.1 sciproxy (squid/3.4.8)
                < Connection: keep-alive
                <
                * Connection #0 to host sciproxy left intact
                * Closing connection #0

## Question 3 :

commande : `curl -v -H "Accept-Language: en;q=0.6, fr;q=0.7, de;q=0.3"  -x  sciproxy:60158 http://math.univ-bpclermont.fr/~barrel/TP/test.html --proxy-user locroce`

sortie :

                Enter proxy password for user 'locroce':
                * About to connect() to proxy sciproxy port 60158 (#0)
                *   Trying 172.17.160.21...
                * connected
                * Connected to sciproxy (172.17.160.21) port 60158 (#0)
                * Proxy auth using Basic with user 'locroce'
                > GET http://math.univ-bpclermont.fr/~barrel/TP/test.html HTTP/1.1
                > Proxy-Authorization: Basic bG9jcm9jZTpsNXI2Yw==
                > User-Agent: curl/7.26.0
                > Host: math.univ-bpclermont.fr
                > Accept: */*
                > Proxy-Connection: Keep-Alive
                > Accept-Language: en;q=0.6, fr;q=0.7, de;q=0.3
                >
                * additional stuff not fine transfer.c:1037: 0 0
                * HTTP 1.1 or later with persistent connection, pipelining supported
                < HTTP/1.1 200 OK
                < Date: Mon, 08 Feb 2016 14:08:13 GMT
                < Server: Apache/2.4.10 (FreeBSD) OpenSSL/1.0.1l-freebsd PHP/5.6.4
                < Content-Location: test.html.txt.fr
                < Vary: negotiate,accept,accept-language
                < TCN: choice
                < Last-Modified: Tue, 03 Feb 2015 10:07:32 GMT
                < ETag: "a-50e2c3d384100;52adcf364c418"
                < Accept-Ranges: bytes
                < Content-Length: 10
                < Content-Type: text/plain
                < Content-Language: fr
                < X-Cache: MISS from sciproxy
                < X-Cache-Lookup: MISS from sciproxy:60158
                < Via: 1.1 sciproxy (squid/3.4.8)
                < Connection: keep-alive
                <
                Bienvenue
                * Connection #0 to host sciproxy left intact
                * Closing connection #0

## Question 4 :

*If-Modified-Since*

commande : `curl -v -H 'If-Modified-Since : Tue, 03 Feb 2015 10:07:32 GMT' -x  sciproxy:60158 http://math.univ-bpclermont.fr/~barrel/TP/test.html --proxy-user locroce`

sortie :

                Enter proxy password for user 'locroce':
                * About to connect() to proxy sciproxy port 60158 (#0)
                *   Trying 172.17.160.21...
                * connected
                * Connected to sciproxy (172.17.160.21) port 60158 (#0)
                * Proxy auth using Basic with user 'locroce'
                > GET http://math.univ-bpclermont.fr/~barrel/TP/test.html HTTP/1.1
                > Proxy-Authorization: Basic bG9jcm9jZTpsNXI2Yw==
                > User-Agent: curl/7.26.0
                > Host: math.univ-bpclermont.fr
                > Accept: */*
                > Proxy-Connection: Keep-Alive
                > If-Modified-Since : Tue, 03 Feb 2015 10:07:32 GMT
                >
                * additional stuff not fine transfer.c:1037: 0 0
                * HTTP 1.1 or later with persistent connection, pipelining supported
                < HTTP/1.1 304 Not Modified
                < Date: Mon, 08 Feb 2016 14:21:37 GMT
                < Content-Type: text/plain
                < Last-Modified: Tue, 03 Feb 2015 10:07:32 GMT
                < Age: 586
                < X-Cache: HIT from sciproxy
                < X-Cache-Lookup: HIT from sciproxy:60158
                < Via: 1.1 sciproxy (squid/3.4.8)
                < Connection: keep-alive
                <
                * Connection #0 to host sciproxy left intact
                * Closing connection #0

...