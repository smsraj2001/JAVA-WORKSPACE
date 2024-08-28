package com.stackroute.exercises;

import java.io.*;

public class FileMigration 
{

    // Method to duplicate file content from source to destination
    public String fileContentDuplicator(String firstFile, String secondFile) throws IOException 
    {
        String errorMessage = "Given fileName to read or write is empty, null or blank space";
        
        // Check if any file name is null, empty or blank
        if (firstFile == null || secondFile == null || firstFile.trim().isEmpty() || secondFile.trim().isEmpty()) 
        {
            return errorMessage;
        }
        
        // Trim whitespace from the file names
        firstFile = firstFile.trim();
        secondFile = secondFile.trim();
        
        // Initialize file streams
        BufferedInputStream bin1 = null;
        BufferedInputStream bin2 = null;
        BufferedOutputStream bout = null;
        try 
        { 
            bin1 = new BufferedInputStream(new FileInputStream(firstFile));
            bout = new BufferedOutputStream(new FileOutputStream(secondFile));
             
            int read = bin1.read();
            while (read != -1) 
            {
                bout.write(read);
                read = bin1.read();
            }
            bout.flush();
            bin1.close();
            bout.close();
        } 
        catch (IOException e) 
        {
            // If there's an error in file handling, throw IOException
            throw new IOException("Error occurred while handling files", e);
        }
        
        // Return the content read from the source file (for testing purposes)
        String result = "";
        bin2 = new BufferedInputStream(new FileInputStream(secondFile));
        result = new String(bin2.readAllBytes());
        bin2.close();
        return result; 
        }
    }
