package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {

        return suffix + "-" + UUID.randomUUID().toString();

    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);

        System.out.println("class"+className);

        String newClassName ="";

        for(int n=0; n<className.length(); n++){
            char newName=className.charAt(n);
            if(Character.isUpperCase(newName))
            {
                newClassName +=newName;
            }
        }
//
        return newClassName;
      //  throw new UnsupportedOperationException("Not yet supported!");
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line 17 [throw new UnsupportedOperationException("Not yet supported!");]
         * 2. Get the capitalized letter(s) from the className and return it.
         */
    }
}
