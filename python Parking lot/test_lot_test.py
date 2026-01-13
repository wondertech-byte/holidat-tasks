import unittest
import parking_lot

class Parking_lot(unittest.TestCase):
    parking_space = [0 for _ in range(20)]
    def test_if_is_occupied(self):
        actual = parking_lot.is_occupied(self.parking_space, 1)
        self.assertFalse(actual)

    def test_book_slot_book_avilable_slot(self):
        parks = [0 for _ in range(10)]
        actual = parking_lot.book_slot(parks, 1)
        self.assertEqual(actual, " slot2 Booked successfully".upper())
        
    def test_book_slot_book_unavilable_slot(self):
        parks = [0 for _ in range(10)]
        parking_lot.book_slot(parks, 1)
        actual = parking_lot.book_slot(parks, 1)
        self.assertEqual(actual, "ALREADY OCCUPIED")

    def test_unoccupy_slot_when_slot_is_occupied(self):
        parks = [0 for _ in range(10)]
        parking_lot.book_slot(parks, 1)
        actual = parking_lot.unoccupy_slot(parks, 1)
        self.assertEqual(actual, "SLOT2 UNOCCUPIED SUCCESSFULLy")

    def test_unoccupy_slot_when_slot_is_not_occupied(self):
        parks = [0 for _ in range(10)]
        actual = parking_lot.unoccupy_slot(parks, 1)
        self.assertEqual(actual, "SLOT2 NEVER OCCUPIED")

    def test_occupied_space(self):
        parks = [0 for _ in range(10)]
        parking_lot.book_slot(parks, 1)
        expected = [2]
        actual = parking_lot.occupied_space(parks)
        self.assertEqual(actual, expected)

    def test_unoccupied_space(self):
        parks = [0 for _ in range(10)]
        parking_lot.book_slot(parks, 0)
        expected = [2,3,4,5,6,7,8,9,10]
        actual = parking_lot.unoccupied_space(parks)
        self.assertEqual(actual, expected)
        
        


