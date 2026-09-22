/*
 * Factorial Program in Go
 *
 * Compile:
 *   go build factorial.go
 *
 * Run:
 *   ./factorial
 *
 * Or directly:
 *   go run factorial.go
 */

package main

import "fmt"

func factorial1(numIn int) int {
	fac := 1
	counter := numIn

	if numIn > 0 {
		for counter > 1 {
			fac = fac * counter
			counter = counter - 1
		}
		return fac
	} else {
		return -1
	}
}

func main() {
	var input int

	fmt.Print("Enter the number >>> ")
	fmt.Scan(&input)

	if factorial1(input) == -1 {
		fmt.Println("Invalid Number in input !!!")
	} else {
		fmt.Printf("Factorial for %d is %d\n", input, factorial1(input))
	}
}
