from typing import List

class Solution:

    @staticmethod
    def checkAnagram(str1: str, str2: str) -> bool:
        if len(str1) != len(str2):
            return False

        freq1 = {}
        freq2 = {}

        for ch in str1:
            freq1[ch] = freq1.get(ch, 0) + 1

        for ch in str2:
            freq2[ch] = freq2.get(ch, 0) + 1

        return freq1 == freq2

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = []
        visited = [False] * len(strs)

        for i in range(len(strs)):
            if visited[i]:
                continue

            group = [strs[i]]
            visited[i] = True

            for j in range(i + 1, len(strs)):
                if not visited[j] and Solution.checkAnagram(strs[i], strs[j]):
                    group.append(strs[j])
                    visited[j] = True

            result.append(group)

        return result
