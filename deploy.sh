#!/bin/bash

# SSH deployment script for Play with Docker
echo "Deploying Spring Boot app to Play with Docker..."

# Connect and deploy
ssh ip172-18-0-36-d29ehni91nsg00fa4qk0@direct.labs.play-with-docker.com << 'EOF'
# Clone the repository
git clone https://github.com/Rajib3811/api-testing.git
cd api-testing

# Build and run the application
docker-compose up --build -d

# Show running containers
docker ps

# Show logs
docker-compose logs -f
EOF

echo "Deployment complete!"
echo "Your application should be accessible at: http://192.168.0.19:8080"