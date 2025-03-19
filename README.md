# Logarithmic-Regression-Calculator
 
## 📌 Project Overview  
Logarithmic Regression Calculator is a mobile application designed to perform **logarithmic regression analysis** for a given set of data points.  
Users can input paired $(x, y)$ values, and the app will compute the **best-fit logarithmic equation** of the form:

$$ y = a \ln{x} + b $$

along with the **correlation coefficient** $r$.

## 🚀 Features  
- **📥 Data Input**
  - Enter multiple $(x, y)$ data pairs.
- **🔢 Data Management**
  - Modify existing data entries.
  - Delete specific data points or the most recent entry.
  - **Triple-click to clear all data.**
- **📊 Logarithmic Regression Calculation**
  - Computes best-fit parameters $a$ and $b$ using least-squares regression.
  - Uses the formula:  
    $$ y = a \ln{x} + b $$
  - Computes the correlation coefficient $r$, which measures the fit quality:  
    $$ r = \frac{n \sum (\ln{x_i} \, y_i) - \sum \ln{x_i} \, \sum y_i}{\sqrt{\left[n \sum (\ln{x_i})^2 - \left(\sum \ln{x_i}\right)^2\right]\left[n \sum y_i^2 - \left(\sum y_i\right)^2\right]}} $$
  - Displays key computed values:
    - Regression equation: $y = a \ln{x} + b$
    - Regression coefficient: $r$
    - Computed values: $a$ and $b$
- **🎨 User-Friendly Interface**
  - Intuitive UI for easy data entry and modifications.
  - Buttons for adding, editing, clearing, and running regression calculations.

## 🚀 Features  
- 📊 **Logarithmic Curve Fitting** – Computes the best-fit logarithmic equation.
- 🔢 **Dynamic Data Input** – Enter, update, or delete data points easily.
- 🛠 **Regression Formula Display** – Shows the final logarithmic equation.
- 🎯 **Interactive Interface** – Simple and user-friendly design.

## 🛠️ Tech Stack  
- **Platform:** Android  
- **Languages:** Java
- **UI Framework:** Android XML  
- **Math Libraries:** Custom implementation for statistical calculations  

## 📦 Installation & Setup  

### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/neutrino2306/Logarithmic-Regression-Calculator.git
cd Logarithmic-Regression-Calculator
```
### 2️⃣ Run the Application  
_(Modify based on how your app runs)_

#### If using Android Studio:
1. Open the project in **Android Studio**.
2. Build and run the application on an emulator or physical device.

## 📮 Contact  
Created by [neutrino2306](https://github.com/neutrino2306) – Feel free to reach out! 🚀
