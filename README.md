# cloud-demo
需注意：服务提供者提供服务时，需要在yml中添加路由ribbon,否则服务消费至无法调用该服务，
会报com.netflix.client.ClientException: Load balancer does not have available server for client: provider错误
