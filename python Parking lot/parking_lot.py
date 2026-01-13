


def is_occupied(parking_space: list[int], index: int)-> bool:
    if parking_space[index] == 1:
        return True
    return False
 
def book_slot(parking_space: list[int], index: int)-> str:
    if not is_occupied(parking_space, index):
        parking_space[index] = 1
        return f" slot{index + 1} Booked successfully".upper()
    return "already Occupied".upper() 

def unoccupy_slot(parking_space: list[int],index: int)-> str:
    if is_occupied(parking_space, index):
        parking_space[index] = 0
        return f"SLOT{index + 1} UNOCCUPIED SUCCESSFULLy" 
    return f"SLOT{index +1} NEVER OCCUPIED"

def occupied_space(parking_space: list[int]) -> list[int]:
   return [index for index, park_space in enumerate(parking_space, 1) if park_space == 1]

def unoccupied_space(parking_space: list[int]) -> list[int]:
   return [index for index, park_space in enumerate(parking_space, 1) if park_space == 0]




