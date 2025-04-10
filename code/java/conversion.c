#include <stdio.h>
#include <stdlib.h>
int main() {
    int choice, decimal;
    char num[50];
    printf("Choose an operation:\n");
    printf("1. Convert Decimal to Hexadecimal\n");
    printf("2. Convert Decimal to Octal\n");
    printf("3. Convert Decimal to Binary\n");
    printf("4. Convert Hexadecimal to Decimal\n");
    printf("5. Convert Octal to Decimal\n");
    printf("6. Convert Binary to Decimal\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);
    switch (choice) {
        case 1:
            printf("Enter a decimal number: ");
            scanf("%d", &decimal);
            printf("Decimal %d in Hexadecimal: %X\n", decimal, decimal);
            break;
        case 2:
            printf("Enter a decimal number: ");
            scanf("%d", &decimal);
            printf("Decimal %d in Octal: %o\n", decimal, decimal);
            break;
        case 3:
            printf("Enter a decimal number: ");
            scanf("%d", &decimal);
            printf("Decimal %d in Binary: ", decimal);
            for (int i = 31; i >= 0; i--) {
                printf("%d", (decimal >> i) & 1);
            }
            printf("\n");
            break;
        case 4:
            printf("Enter a hexadecimal number: ");
            scanf("%s", num);
            printf("Hexadecimal %s in Decimal: %d\n", num, (int)strtol(num, NULL, 16));
            break;
        case 5:
            printf("Enter an octal number: ");
            scanf("%s", num);
            printf("Octal %s in Decimal: %d\n", num, (int)strtol(num, NULL, 8));
            break;
        case 6:
            printf("Enter a binary number: ");
            scanf("%s", num);
            printf("Binary %s in Decimal: %d\n", num, (int)strtol(num, NULL, 2));
            break;
        default:
            printf("Invalid choice! Please enter a valid number.\n");
            break;}
return 0;}