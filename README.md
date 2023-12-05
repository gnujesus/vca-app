# README

## General Information
The system is currently on the version `1.0.9`.

## Disclaimers
- Even though this is written in English, the application is currently in Spanish.
- The terms "vehicle count" and "traffic count" will be used interchangeably, since they mean the same.

## Importing Packages
The necessary libraries to execute this project were included in the `libraries` folder. The only thing to do is importing the in the project after opening it on NetBeans (or your preferred editor, IntelliJ if you may).
Not that the driver for MySQL is on a `.zip` file. Extract it and import the `.jar` file into the project.

## Usage
### Log in & Registration
In order to enter to the application, you must first have a user, which has to be created in the registration view.
![image](https://github.com/juandma0/vca-app/assets/107089453/dd2234f3-42d8-47bf-ac23-895c07d2a1ec)
This view is accessed by pressing the option `Register new user` on the `login` view that appears when the application starts.

### Admin Dashboard
The Admin Dashboard comes with many functionalities:
- Side navegation bar
- Statistics live view
- Vehicle count table live view

#### Side Navegation bar
The side navegation currently has the options:
- Encuestas (Yet to do)
- Modo Aforador: Start a simulation of the mobile counting application (Yet to develop)
- Settings (Yet to do)
- Logout: Logs out of the application
- About: Displays general information about the application

#### Statistics Live View
The are two chars over the table in the admin dashboard, a pie chart and a bar chart. Both of this charts update depending on the selected vehicle count. The chart on the left (bar chart) displays a live view of the current vehicle concurrency in the selected traffic count, and the chart on the right (pie chart) will display the current concurrency on each intersection.

### Vehicle Count Table Live Preview
The Table Live Preview provides a live preview of the currently on-going vehicle counts, as well as past vehicle counts, thus display the following information about the vehicle count:
- ID
- Name
- Code
- Intersection
- Interval
- Starting time
- Finishing Time
- Date
- Total

There are two bottom above the top right corner of the table: the `Refresh` button, and the `Nuevo aforo` button. The `Refresh` button updates the data on the table, in case it doesn't update automatically. the `Nuevo aforo` button creates a new vehicle count.

When the `Nuevo aforo` button is pressed, a view is displayed over the Admin Dashboard:
![image](https://github.com/juandma0/vca-app/assets/107089453/e3921505-b520-4340-ace5-c684ef6b0dd2)
This view allows the user to create a new intersection in which the traffic count will be taking place. This view allows you to specify the `name`, `street` and `province` of the intersection.
When the `Siguiente` button is pressed, another view gets displayed on the screen:
![image](https://github.com/juandma0/vca-app/assets/107089453/869cd36c-1133-48dc-99c5-68355dad4d93)
This view allows the admin to specify the main information necessary to create a new vehicle count:
- Vehicle Count Code: What is the desired code for the vehicle count
- Starting Time: When will the count start
- Finishing Time: When will the count finish
- Name of the Vehicle Count: What's the desired name of the count
- Vehicle Count Interval: What is the time interval between each count
- Date of the Vehicle Count: When will the count take place
After clicking create, the vehicle count will be sucessfully created and will be ready for it's monitoring.

