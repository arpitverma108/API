
# Project Title
🛍️ Product Display App (API + Picasso)

A beginner-friendly Android app built in Kotlin that **fetches product data from a REST API** and displays it using a custom RecyclerView. It also uses **Picasso** to load product images from URLs. This project demonstrates my learning and implementation of API integration, JSON parsing, and image loading in Android. 🚀


## ✨ Features

✅ Fetches product data using a REST API  
✅ Loads images from URLs using **Picasso**  
✅ RecyclerView with custom Adapter & ViewHolder  
✅ Clean Material UI with product image and name  
✅ Simple, modular structure ideal for beginners  

## 🌐 API Integration

This app fetches product details from a web API (JSON format), demonstrating:

- Making HTTP requests
- Parsing JSON data
- Displaying dynamic content using RecyclerView


> 📌 *This project was created to showcase my understanding of API handling and loading data from the internet in Android.*

## 🖼️ Image Loading with Picasso

Picasso library is used to efficiently load and cache product images from the API-provided URLs.

```kotlin
Picasso.get().load(imageUrl).into(imageView)

