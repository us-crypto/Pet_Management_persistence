section .data
    prompt1 db "Enter first number: "
    prompt2 db "Enter second number: "
    result db "Result: "

section .bss
    num1 resb 10
    num2 resb 10
    res resb 10

section .text
    global _start

_start:
    ; Print the first prompt and read in the first number
    mov eax, 4
    mov ebx, 1
    mov ecx, prompt1
    mov edx, 18
    int 0x80

    mov eax, 3
    mov ebx, 0
    mov ecx, num1
    mov edx, 10
    int 0x80

    ; Print the second prompt and read in the second number
    mov eax, 4
    mov ebx, 1
    mov ecx, prompt2
    mov edx, 19
    int 0x80

    mov eax, 3
    mov ebx, 0
    mov ecx, num2
    mov edx, 10
    int 0x80

    ; Convert the input strings to integers
    mov eax, num1
    call atoi
    mov ebx, eax

    mov eax, num2
    call atoi
    mov ecx, eax

    ; Perform the arithmetic operation based on the input operator
    mov eax, [esp + 8]
    cmp eax, '+'
    je add

    cmp eax, '-'
    je sub

    cmp eax, '*'
    je mul

    cmp eax, '/'
    je div

    ; If the operator is not recognized, print an error message and exit
    mov eax, 4
    mov ebx, 1
    mov ecx, error
    mov edx, 14
    int 0x80

    jmp end

add:
    add ebx, ecx
    jmp print_result

sub:
    sub ebx, ecx
    jmp print_result

mul:
    imul ebx, ecx
    jmp print_result

div:
    xor edx, edx
    div ecx
    jmp print_result

print_result:
    ; Convert the result integer to a string and print it
    mov eax, ebx
    call itoa

    mov eax, 4
    mov ebx, 1
    mov ecx, result
    mov edx, 8
    int 0x80

    mov eax, 4
    mov ebx, 1
    mov ecx, res
    mov edx, 10
    int 0x80

end:
    ; Exit the program
    mov eax, 1
    xor ebx, ebx
    int 0x80

; Function to convert a string to an integer
atoi:
    push eax
    xor eax, eax

atoi_loop:
    mov bl, byte [eax]
    cmp bl, 0x0a
    je atoi_done

    sub bl, 0x30
    imul eax, 10
    add eax, ebx
    inc eax

    jmp atoi_loop

atoi_done:
    dec eax
    pop ebx
    ret

; Function to convert an integer to a string
itoa:
    push eax
    push ebx
    push ecx
    push edx

    mov ecx, 10
    xor ebx, ebx
    xor edx, edx

itoa_loop:
    div ecx
    add edx, '0'
    push edx
    inc
