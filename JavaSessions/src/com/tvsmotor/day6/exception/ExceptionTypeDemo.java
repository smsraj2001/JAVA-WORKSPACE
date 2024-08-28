package com.tvsmotor.day6.exception;

// Custom runtime exception for ID not found
class IdNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public IdNotFoundException(String message) {
        super(message);
    }
}

// Custom checked exception for invalid age

class InValidAgeException2 extends Exception {
    private static final long serialVersionUID = 1L;

    public InValidAgeException2(String message) {
        super(message);
    }
}

public class ExceptionTypeDemo {
    public static void main(String[] args) {
        try {
            // Example of throwing and handling a runtime exception
            simulateRuntimeException();

            // Example of throwing and handling a checked exception
            simulateCheckedException();
        } catch (InValidAgeException2 e) {
            // Handle the checked exception
            System.err.println("Caught checked exception: " + e.getMessage());
        } catch (IdNotFoundException e) {
            // Handle the runtime exception
            System.err.println("Caught runtime exception: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other exceptions
            System.err.println("Caught general exception: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("Execution finished.");
        }
    }

    // Method that throws a runtime exception
    private static void simulateRuntimeException() {
        System.out.println("Simulating runtime exception...");
        throw new IdNotFoundException("ID not found in the system.");
    }

    // Method that throws a checked exception
    private static void simulateCheckedException() throws InValidAgeException2 {
        System.out.println("Simulating checked exception...");
        // Here you can conditionally throw the exception based on some logic
        throw new InValidAgeException2("The provided age is invalid.");
    }
}
