import parking_lot

def display_parking_space(parking_space: list[int])-> None:
    print("==================================")
    print(" LOT NUMBER\tAVAILABILITY");
    print("==================================")
    for number, index in enumerate (range(20), 1):
        if parking_space[index] == 0:
            print(f"\t{number}  \tavailable")
        else: 
            print(f"\t{number}  \t[occupied]")


parking_space = [0 for _ in range(20)]
3

menu = """ 
    CAR PARK SYSTEM
=======================
1. Check availability
2. park car
3. move car
======================
"""
option  = -1;

while option != 0:
    print(menu)
    option = int(input("Enter option: "))
    match option:
        case 1 :
            display_parking_space(parking_space)
        case 2 : 
              print("Choose from the available parking space\n",parking_lot.unoccupied_space(parking_space))
              park_space = int(input("Enter available space number: "))
              parking = parking_lot.book_slot(parking_space, park_space - 1)
              print(parking)
        case 3 :
              print("Enter occupied space Number\n", parking_lot.occupied_space(parking_space))
              park_space = int(input("Enter space number: "))
              parking = parking_lot.unoccupy_slot(parking_space, park_space - 1)
              print(parking)
        
       










