# Graph-Parking-Optimizer


Welcome to the Esenboğa Airport Parking Facility repository! This project is designed to help manage the parking slots at Esenboğa Airport, which is represented as a graph with N nodes and M edges. Each node represents a parking slot with a capacity for vehicles, and each edge has a weight (w) representing the cost to travel between parking slots. Additionally, there is a parking fee (F) per vehicle, which is the same for all slots.

## Problem Statement

At Esenboğa Airport, there is a parking facility in the form of a graph with N nodes and M edges. The graph does not have self-loops or multiple edges. Each node represents a parking slot with a capacity for vehicles. Each edge has a weight (w), indicating the cost to go from node u to node v. All parking slots have a parking fee (F) per vehicle, which is the same for all slots.

There are K identical vehicles entering the parking facility, each numbered from 1 to K. The vehicles enter in their natural order, with vehicle number 1 entering first, followed by vehicle number 2, and so on until vehicle number K. For each vehicle, you need to calculate and print the minimum total cost incurred by the vehicle owner. The total cost includes the cost of the path taken to reach the parking slot and the parking fee for the slot.

It is guaranteed that you can reach any slot from any other slot. All vehicles entering the parking facility start from parking slot 1.

## Features

- Calculation of the minimum total cost for vehicles entering the parking facility.
- Consideration of parking slot capacity, edge weights, and parking fees.
- Support for multiple test cases and customizable parking facility parameters.
- Clear and extensible Java codebase.

## Getting Started

1. Clone this repository to your local machine.

2. Compile and run the Java program using your preferred Java development environment.

3. Follow the prompts to input the necessary parameters and calculate the minimum total cost for vehicles.

## Usage

To use the the Airport Parking Cost Calculator, follow these steps:

1. Run the Java program.

2. Enter the number of nodes (parking slots), number of edges (connections), and parking fee (F).

3. Provide the seating capacity for each parking slot and specify the distance (weight) between parking slots.

4. Enter the number of vehicles (K) entering the parking facility.

5. The program will calculate and display the minimum total cost for each vehicle entering the facility.

## Input Format

In the input, the first line contains 3 space separated integers, N, M and F. N denotes the
number of nodes, M denotes the number of edges and F denotes the parking fee.

The second line
consists of N space separated integers denoting the seating capacity of each parking slot. Following
M lines contain three space separated integers each: u, v and w, denoting we can reach from node
u to node v incurring a cost of w units. 

The last line of input contains an integer K denoting the
number of vehicles enter the parking facility.


In the first line it is given that we have 5 parking slots, 4 connections between the parking
slots and 10 as parking fee which is the base fee for each car enters the parking facility. In the
second line, we have 5 parking slots with their capacity which are 1, 2, 1, 1, and 2. In the next 4
lines, the distance between these parking slots is given and the number of vehicles will be entering
the parking facility is 5. Program  gives the total cost each car enters the facility.


<img width="679" alt="Screenshot 2023-11-06 at 20 34 49" src="https://github.com/sarparslan/Graph-Parking-Optimizer/assets/96438389/77892391-a2c2-453c-b5e2-14e4840b16b1">


## Output Format

In the output, program prints K space separated integers denoting answer for each vehicle. ith integer
in the space separated integers denotes answer for ith vehicle number. If it is not possible to enter
a parking slot print −1 for that vehicle.

<img width="679" alt="Screenshot 2023-11-06 at 20 35 04" src="https://github.com/sarparslan/Graph-Parking-Optimizer/assets/96438389/da60ffaf-632a-4154-96cd-06d9df6c3842">

