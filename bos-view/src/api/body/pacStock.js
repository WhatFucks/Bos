import request from '@/utils/request'

export function addPacStock(stock) {
  return request({
    url: '/stock/addPacStock',
    method: 'post',
    data: stock
  })
}

export function updatePacStock(stock) {
  return request({
    url: '/stock/updatePacStock',
    method: 'post',
    data: stock
  })
}

export function deletePacStock(id) {
  return request({
    url: '/stock/deletePacStock',
    method: 'post',
    data: { id }
  })
}

export function getPacStockList(query) {
  return request({
    url: '/stock/getPacStockList',
    method: 'post',
    data: query
  })
}
