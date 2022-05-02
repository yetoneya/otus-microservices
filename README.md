# otus-microservices
docker build -t myapp:latest .
docker tag myapp:latest yetoneya/myapp:latest
docker push yetoneya/myapp:latest

docker rmi -f $(docker images -a -q)

minikube start
minikube stop

kubectl create -f deployment.yaml
kubectl create -f service.yaml
kubectl create -f ingress.yaml

kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
kubectl apply -f ingress.yaml 
kubectl get pod

kubectl get services

kubectl get svc

kubectl get all

kubectl delete deployment --all
kubectl delete service --all
kubectl delete ingress --all

kubectl describe services myapp-s
kubectl describe ingresses myapp-i

minikube start

minikube addons enable ingress
kubectl get pods -n ingress-nginx

kubectl create deployment myapp-deployment --image=yetoneya/myapp:latest -o=yaml > deployment.yaml
echo --- >> deployment.yaml
kubectl expose deployment myapp-deployment --type=NodePort --port=8000 -o=yaml >> deployment.yaml

kubectl get service myapp-s

minikube service myapp-s --url

curl http://192.168.59.100:30119/health

kubectl apply -f ingress.yaml
kubectl get ingress
















