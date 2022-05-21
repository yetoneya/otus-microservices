## hw-1

[![](https://github.com/yetoneya/pictures/blob/main/hw-ms-1.png)

docker build -t myapp:latest .
docker tag myapp:latest yetoneya/myapp:latest
docker push yetoneya/myapp:latest

docker rmi -f $(docker images -a -q)

minikube start
minikube addons enable ingress
minikube stop

kubectl create -f k8s
minikube service postgres --url

kubectl get pod
kubectl get ingress
kubectl get service
kubectl get all

kubectl describe pod
kubectl describe services myapp-s
kubectl describe ingresses myapp-i

kubectl get pods -n ingress-nginx

kubectl get service myapp-s
minikube service myapp-s --url

curl http://192.168.59.100:30119/health
curl http://192.168.59.100/health
curl http://arch.homework/health

## hw-2

[![](https://github.com/yetoneya/pictures/blob/main/hw-ms-2.png)

minikube start

kubectl create -f k8s/postgres.yaml

kubectl create configmap hostname-config --from-literal=postgres_host=$(kubectl get svc postgres -o jsonpath="{.spec.clusterIP}") -o=yaml > k8s/hostname-config.yaml

./mvnw -DskipTests package

docker build -t myapp-ext:latest .
docker tag myapp-ext:latest yetoneya/myapp-ext:latest
docker push yetoneya/myapp-ext:latest

kubectl create -f k8s/app-deployment.yaml

kubectl expose deployment myapp-d --type=NodePort --port=8000 -o=yaml > k8s/app-service.yaml

kubectl get svc myapp-d

kubectl create -f k8s/ingress.yaml














