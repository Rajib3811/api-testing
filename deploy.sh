#!/bin/bash

echo "🚀 Deploying API Testing Application to Docker..."

# Build the Docker image
echo "📦 Building Docker image..."
docker build -t apitesting-app .

# Stop and remove existing container if it exists
echo "🛑 Stopping existing container..."
docker stop apitesting-app 2>/dev/null || true
docker rm apitesting-app 2>/dev/null || true

# Run the container
echo "▶️ Starting new container..."
docker run -d \
  --name apitesting-app \
  -p 8080:8080 \
  apitesting-app

# Show running containers
echo "📋 Container status:"
docker ps | grep apitesting-app

echo "✅ Deployment complete!"
echo "🌐 Application should be available at: http://localhost:8080"
echo "📊 API endpoints:"
echo "   - http://localhost:8080/hello"
echo "   - http://localhost:8080/api/countries"
echo "   - http://localhost:8080/api/biometric/fingerprint"
echo "   - http://localhost:8080/api/sms/send"
echo "   - http://localhost:8080/chat (WebSocket chat)"

# Show logs
echo "📝 Container logs (last 10 lines):"
docker logs apitesting-app --tail 10