## __Log Aggregation Grafana Loki__

    $ mvn clean install
    $ docker build -t grafana-loki-app .
    $ docker container run --log-opt max-size=5m --log-opt max-file=3 --name grafana-loki-app-container -p 8087:8087 -d grafana-loki-app
    $ nano /opt/loki/config/promtail-config.yml
    $ nano /opt/loki/config/loki-config.yml
    $ docker-compose -f docker-compose.yml up -d

<h3 align="left"></h3>
<p align="left"> 
<a href="https://grafana.com/docs/loki/latest/" target="_blank"> <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Grafana_logo.svg/800px-Grafana_logo.svg.png" alt="grafana" width="50" height="50"/>