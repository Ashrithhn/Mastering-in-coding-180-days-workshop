"""
* -----------------------------------------------------------------------------
* 
* Copyright <2024> <algorithms365>
* 
* Professional Coding Skills Workshops
* 
* Licensed under the MIT License:
*  
* https://opensource.org/licenses/MIT
* 
* For more information about algorithms365:
* Visit Our Skills Website: https://skills.algorithms365.com/
* Our Company Website: https://algorithms365.com/
*
* For Regular Updates Follow & Subscribe Us on Our Social Media Platforms:
* Instagram: https://www.instagram.com/algorithms365/
* YouTube: https://www.youtube.com/@algorithms365
* Facebook: https://www.facebook.com/algorithms365 
* Twitter(X): https://x.com/algorithms365
* LinkedIn: https://www.linkedin.com/company/algorithms365-technologies-llp/
* 
* Join Our Communities:
* WhatsApp: https://chat.whatsapp.com/K1K7wDMEXG0DJhqMCxFtht
* Telegram: https://t.me/+hyVHXek9WM0zNWQ1
* 
* -----------------------------------------------------------------------------
"""
import os

def explore_directories(root_directory):
    try:
        # List all the entries in the directory
        entries = os.listdir(root_directory)
        for entry in entries:
            path = os.path.join(root_directory, entry)
            if os.path.isdir(path):
                print(path)
                # Recursively explore the sub-directory
                explore_directories(path)
    except PermissionError:
        # Handle the case where the program doesn't have permission to access a directory
        print(f"Permission denied: {root_directory}")
    except FileNotFoundError:
        # Handle the case where a directory was not found
        print(f"Directory not found: {root_directory}")

# Example usage
root_directory = "C:/Users/ashri/Desktop/Krishna-Batch"  # Replace with the root directory path you want to explore
explore_directories(root_directory)
