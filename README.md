## hw-1

[![](https://github.com/yetoneya/pictures/blob/main/hw-ms-1.png)

docker build -t myapp:latest .
docker tag myapp:latest yetoneya/myapp:latest
docker push yetoneya/myapp:latest

docker rmi -f $(docker images -a -q)

minikube start
minikube addons enable ingress
minikube stop

kubectl create -f deployment.yaml
kubectl create -f service.yaml
kubectl create -f ingress.yaml
kubectl create -f k8s

kubectl delete deployment --all
kubectl delete service --all
kubectl delete ingress --all

kubectl describe pod
kubectl get ingress

kubectl describe services myapp-s
kubectl describe ingresses myapp-i

kubectl get pods -n ingress-nginx

kubectl create deployment myapp-deployment --image=yetoneya/myapp:latest -o=yaml > deployment.yaml
echo --- >> deployment.yaml
kubectl expose deployment myapp-deployment --type=NodePort --port=8000 -o=yaml >> deployment.yaml

kubectl get service myapp-s

minikube service myapp-s --url

curl http://192.168.59.100:30119/health
curl http://192.168.59.100/health
curl http://arch.homework/health


















