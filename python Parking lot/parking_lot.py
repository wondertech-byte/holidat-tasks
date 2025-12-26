


def all_lists():
    availability = "available"
    car_name = None
    lists = [[availability, car_name]for _ in range(20)]
    return lists
    


def get_parking_space(index, car_name):
    if all_lists()[index-1][0] == "available":
        all_lists()[index-1][0] = "unavailable"
        all_lists()[index-1][1] = car_name
        print("slot books successfully")

def leave_parking_space(index,car_name ):
    if all_lists()[index-1][0] == "unavailable" and all_lists()[index-1][1] == car_name :
        all_lists()[index-1][0] = "available"
        all_lists()[index-1][1] = None
        return all_list()
    print("car not in car pack")

def get_all_available_space(lists):
    new_list = []
    for slot in lists:
        if slot[0] == "available":
            new_list.append(slot)
    return new_list


def get_all_aunvailable_space(lists):
    new_list = []
    for slot in lists:
        if slot[0] == "unavailable":
            new_list.append(slot)
    return new_list


lists = []
parking_lot = all_lists()

for index, lots in enumerate(parking_lot, 1):
    print(f"{index}. {lots[0]}\t{lots[1]}")

lot = get_parking_space(1, "camry")
for index, lots in enumerate(parking_lot, 1):
    print(f"{index}. {lots[0]}\t{lots[1]}")
