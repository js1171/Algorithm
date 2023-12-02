SELECT concat('/home/grep/src/',ub.BOARD_ID, '/', uf.FILE_ID, uf.FILE_NAME, uf.FILE_EXT) as FILE_PATH
from USED_GOODS_BOARD ub
inner join USED_GOODS_FILE uf
on ub.BOARD_ID = uf.BOARD_ID
where ub.BOARD_ID = (select BOARD_ID from USED_GOODS_BOARD
order by VIEWS desc limit 1)
order by uf.FILE_ID desc






