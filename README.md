# Snakes and Ladders Game

## Overview
This is a Java-based implementation of the classic **Snakes and Ladders** game, designed using **Low-Level Design (LLD) principles**. The game supports **2-4 players**, including **human and bot players**, and follows the traditional rules of Snakes and Ladders.

## Game Rules
- The board consists of **100 cells**, numbered from **1 to 100**.
- Players can choose **unique symbols**.
- **Snakes and Ladders** are placed at specific cells:
  - **Snakes**: Players landing on a snake's **head** move down to its **tail**.
  - **Ladders**: Players landing on a ladder's **bottom** climb up to its **top**.
- Players roll a **6-sided dice** to move forward.
- The **first player to reach exactly 100 wins**.
- A **random player starts** the game.
- The winner is checked after each dice roll.

## Features
- **Board with 100 numbered cells**.
- **Unique player symbols with validation**.
- **Bot support**.
- **Snakes and Ladders movement mechanics**.
- **Randomized first player selection**.
- **Winner validation after every move**.

---

## Class Design

### `Game`
- Manages the game flow.
- Holds instances of:
  - `Board`
  - `Players`
  - `Dice`
  - `Snakes`
  - `Ladders`
- Methods:
  - `start()`: Starts the game.
  - `win()`: Checks for the winner.

### `Board`
- Represents the **100-cell grid**.
- Tracks **player positions**.
- Method:
  - `movement()`: Moves players based on dice roll and board rules.

### `Player`
- Attributes:
  - `playerType` (Enum: HUMAN, BOT)
  - `Symbol`
  - `Current Cell`
  - `Turns`
- Method:
  - `throwDie()`: Rolls the dice to determine movement.

### `PlayerType (Enum)`
- `HUMAN`
- `BOT`

### `Snakes`
- Attributes:
  - `head` (starting cell)
  - `tail` (destination cell)
  - `cell`

### `Ladders`
- Attributes:
  - `top` (ending cell)
  - `bottom` (starting cell)
  - `cell`

### `Symbol (Enum)`
- `p1`
- `p2`

### `Dice`
- Attributes:
  - `cell`
  - `count`
  - `limit = 6`
- Method:
  - `throwDie()`: Rolls the dice and returns a number between 1-6.

### `Winner`
- Method:
  - `win()`: Checks if any player has reached **cell 100**.

---

## Image

![Snakes and Ladders Class Diagram]([Snakes&Ladders_ClassDiagram.png](https://github.com/AnaghaShenoy/SnakesAndLadders/blob/main/Snakes%26Ladders_ClassDiagram.png))


## How to Run
1. **Clone the repository**
   ```sh
   git clone https://github.com/AnaghaShenoy/SnakesAndLadders
   cd SnakesAndLadders
   ```
2. **Compile and Run**
```sh
  javac SnakesAndLadders.java
  java SnakesAndLadders
```
3. **Enter the number of players (2-4).**
4. **Provide player names and symbols.**
5. **Play the game!**

