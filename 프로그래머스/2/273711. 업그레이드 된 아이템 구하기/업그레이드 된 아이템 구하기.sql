with t as
(select tree.ITEM_ID from ITEM_TREE tree
 left join ITEM_INFO info
 on info.ITEM_ID = tree.PARENT_ITEM_ID
 where tree.PARENT_ITEM_ID is not NULL and info.RARITY = 'RARE')
 
select t.ITEM_ID, i.ITEM_NAME, i.RARITY from t
left join ITEM_INFO i
on t.ITEM_ID = i.ITEM_ID
order by ITEM_ID desc